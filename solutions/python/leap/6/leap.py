def leap_year(year):
    """Function that returns True if the given year is a leap year, otherwise returns False"""
    if year % 4 == 0:
        if year % 100 == 0:
            if year % 400 == 0:
                return True
        if year % 100 != 0:
            return True

    return False