def counter():    # 
    i = 0
    def count():
        nonlocal i
        i += 1
        return i
    return count
