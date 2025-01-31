def solution(strArr):

    answer = [ v.upper() if (i+1)%2==0 else v.lower() if (i+1)%2==1 else v for i, v in enumerate(strArr)]
    return answer