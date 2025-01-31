def solution(names):
    num = 5
    answer = [ value for idx, value in enumerate(names) if idx%num==0 ]
    return answer