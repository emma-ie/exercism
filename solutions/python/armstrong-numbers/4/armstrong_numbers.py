def is_armstrong_number(number):
    """Returns True/False based on if the given number is an armstrong number"""
    num_to_string = str(number)
    total = 0
    
    for digit in num_to_string:
        total = total + (int(digit) ** len(num_to_string))

    if total == number:
        return True

    return False