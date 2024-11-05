def is_odd(num):
    return num % 2 != 0

def evaluate_test_cases(test_cases):
    for case in test_cases:
        input_value = case['input']
        expected_output = case['output']
        actual_output = is_odd(input_value)
        
        if actual_output == expected_output:
            print(f"[PASSED] {input_value} -> {expected_output}")
        else:
            print(f"[FAILED] {input_value} -> Expected: {expected_output}, Received: {actual_output}")

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
evaluate_test_cases(test_cases)
