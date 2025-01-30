def solution(a, d, included):
    
    # for i, v in enumerate(array) => index, value     
    return sum(a + i * d for i, v in enumerate(included) if v)