"""Return Bob's response based on tone and punctuation of string.
"""
def response(hey_bob):
    """Return Bob's response to the given string.

    Args:
        hey_bob: A string addressed to Bob

    Returns: 
        A string representing Bob's response
    """
    if hey_bob.isupper() and hey_bob.endswith('?'):
        return 'Calm down, I know what I\'m doing!'
        
    if hey_bob.isupper():
        return 'Whoa, chill out!'
        
    if hey_bob.strip().endswith('?'):
        return 'Sure.'  
        
    if hey_bob.isspace() or hey_bob == '':
        return 'Fine. Be that way!'

    return 'Whatever.'