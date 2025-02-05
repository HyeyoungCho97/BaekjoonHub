def solution(num_list, n):
    answer_r = num_list[n:]
    answer_l = num_list[:n]

    return answer_r+answer_l