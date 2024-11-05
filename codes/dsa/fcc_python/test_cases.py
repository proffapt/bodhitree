def is_odd(num):
    return num % 2 != 0

def eval_cases(cases):
    for case in cases:
        input_val = case['input']
        exp_val = case['output']
        obs_val = is_odd(input_val)
        
        if obs_val == exp_val:
            print(f"[PASSED] {input_val} -> {exp_val}")
        else:
            print(f"[FAILED] {input_val} -> Expected: {exp_val}, Received: {obs_val}")

test_cases = []
test_cases.append({
    'input': 8,
    'output': False
    })
test_cases.append({
    'input': 3,
    'output': True
    })
test_cases.append({
    'input': 2,
    'output': True
    })
eval_cases(test_cases)
