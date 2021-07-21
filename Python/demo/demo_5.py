#   creation time:2021/7/14 16:41
#   theme: 切片

#   切片不会改变原列表的大小

#   [start:stop:step]
#   切片范围 :   [start,stop]
#   step :   step默认为1
#   step > 0 :  start默认是列表的第一个元素
#               stop默认是列表的最后一个元素
#               从start开始往后计算切片
#   step < 0 :  start默认是列表的最后一个元素
#               stop默认是列表的第一个元素
#               从start开始往前计算切片


arr = list(range(0,10))
print(arr)

arr2 = arr[3:8:2]
print(arr2)

#   列表倒序 [::-1]

arr3 = arr[::-1]
print(arr3)

