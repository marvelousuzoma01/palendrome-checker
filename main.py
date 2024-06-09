

# testing with python
def is_palindrome(word):
    word = word.lower()
    left = 0
    right = len(word) - 1


    while left < right:
        while not word[left].isalnum() and left < right:
            left += 1
        while not word[right].isalnum() and left < right:
            right -= 1  
        if word[left] != word[right]:
            return False
        left += 1
        right -= 1
    return True


word = input(" ")

if is_palindrome(word):
    print(f"{word} is a palindrome.")
else:
    print(f"{word} is not a palindrome.")
 
