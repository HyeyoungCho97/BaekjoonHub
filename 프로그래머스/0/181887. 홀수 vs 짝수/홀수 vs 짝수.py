def solution(num_list):

    #List Slicing [ 시작인덱스 : 종료인덱스 : step]
    return max(sum(num_list[::2]), sum(num_list[1::2]))