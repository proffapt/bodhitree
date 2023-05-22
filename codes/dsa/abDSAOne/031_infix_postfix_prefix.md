# Infix, Prefix & Postfix

## For us, hoomans

BODMAS - Bracked Order Division Multiplication Addition Subtraction

> Order -> 2^3

#### Infix

- Solved via BODMAS.
- Has an operator(binary operator) between two operands.
- `(((a - b) + ((c * d) / e)) + f)` .. This is how it will look.. a complete mess

## For them, computers

Increasing order of preference
    ^
    | *, / : order of occurance from left
    | -, + : order of occurance from left

#### How?

- Using __stacks__.
    - Operands go into stack, two in number
    - Operator arrives, both are popped.
    - Operation is performed.
    - Result pushed to stack.
    - And repeat.

#### Postfix

- Solved via precedence order
- Has the operator(binary operator) after the operands.
- `a * b = ab *`
- `a - b / c * d * e + f` = `abc / d * e * - f +`

#### Prefix

- Solved via precedence order
- Has the operator(binary operator) before the operands.
- `a * b = * ab`
