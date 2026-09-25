def is_armstrong_number(number):
    """Returns True/False based on if the given number is an armstrong number"""
    num_to_string = str(number)
    str_to_list = list(num_to_string)
    total = 0
    
    for digit in str_to_list:
        total = total + (int(digit) ** len(str_to_list))

    if total == number:
        return True

    return False