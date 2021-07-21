#   creation time:2021/7/14 11:27
#   theme: 水仙花数

arr = range(100, 1000)

for item in range(100, 1000):
    x = item % 10
    y = item //10 %10
    z = item //100
    if( x**3+y**3+z**3 == item):
        print(item)
