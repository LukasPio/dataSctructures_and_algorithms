def arraySum():
    result = 0
    numbers = [*input("Digite os números:\n").split()]
    for number in numbers:
        result += float(number)
    return result


print(arraySum())
