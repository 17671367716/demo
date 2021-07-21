#   creation time:2021/7/14 10:03
#   theme: 文件读写

#   写
fp = open('D:/Project/Python/files/demo_1.txt', 'a+')
print('hello python', file=fp)
fp.close()

#   读
f = open('D:/Project/Python/files/demo_1.txt','r')
print(f.readlines())
f.close()

#   with语句
with open('D:/Project/Python/files/demo_1.txt','w') as file:
    file.write('wite')
with open('D:/Project/Python/files/demo_1.txt','r') as file:
    print(file.read())
