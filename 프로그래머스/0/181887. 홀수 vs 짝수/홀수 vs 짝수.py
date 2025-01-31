def solution(num_list):
    odd = sum([ v for i, v in enumerate(num_list) if (i+1)%2!=0 ])
    even = sum([ v for i, v in enumerate(num_list) if (i+1)%2==0 ])
    
    return odd if odd>even else even