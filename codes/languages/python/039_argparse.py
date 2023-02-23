import argparse

parser = argparse.ArgumentParser()

# Compulsory arguments
parser.add_argument("name", help="Specify your name", default=None)
parser.add_argument("age", help="Specify your age", default=None)

# Optional arguments
parser.add_argument("-v", "--version", help="outputs the version of currrent programm", default=1.0)

args = parser.parse_args()

print(f"You are {args.name} and you are {args.age} years old, and this programm is on version {args.version}")
