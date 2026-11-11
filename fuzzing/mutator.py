import argparse
import random
import string

# Sin \n ni \r: el archivo es de un caso por línea.
RANDOM_CHARS = [c for c in string.printable if c not in "\r\n\x0b\x0c"]
# Caracteres que pegan cerca de la sintaxis del tablero, más algunos unicode.
INTERESTING = list("0123456789,[]- +.xX") + [
    "\u0662",  # dígito arábigo-índico (Long.parseLong lo acepta)
    "\uff12",  # dígito fullwidth
    "\u00a0",  # espacio no separable
    "\u2003",  # em space
    "\t", "\x00",
]

def rand_char():
    return random.choice(INTERESTING if random.random() < 0.7 else RANDOM_CHARS)

def delete_char(s):
    if not s:
        return insert_char(s)
    i = random.randrange(len(s))
    return s[:i] + s[i + 1:]

def insert_char(s):
    i = random.randint(0, len(s))
    return s[:i] + rand_char() + s[i:]

def replace_char(s):
    if not s:
        return insert_char(s)
    i = random.randrange(len(s))
    return s[:i] + rand_char() + s[i + 1:]

MUTATORS = [delete_char, insert_char, replace_char]

def mutate(s, max_mutations):
    for _ in range(random.randint(1, max_mutations)):
        s = random.choice(MUTATORS)(s)
    return s

if __name__ == "__main__":
    ap = argparse.ArgumentParser()
    ap.add_argument("--in", dest="inp", required=True)
    ap.add_argument("--out", required=True)
    ap.add_argument("--seed", type=int, default=0)
    ap.add_argument("--max-mutations", type=int, default=5)
    a = ap.parse_args()
    random.seed(a.seed)
    # Se leen y escriben archivos en UTF-8 de forma explícita (ver nota de PowerShell abajo).
    with open(a.inp, encoding="utf-8") as f, open(a.out, "w", encoding="utf-8", newline="\n") as g:
        for line in f:
            g.write(mutate(line.rstrip("\r\n"), a.max_mutations) + "\n")