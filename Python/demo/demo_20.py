#   creation time:2021/7/16 9:45
#   theme: 字符串内容

#   center(),居中，第一个参数是长度，第二个参数是填充符，默认是空格。设置长度小于字符串长度时，返回原字符串
#   ljust(),左对齐，第一个参数是长度，第二个参数是填充符，默认是空格。设置长度小于字符串长度时，返回原字符串
#   rjust(),右对齐，第一个参数是长度，第二个参数是填充符，默认是空格。设置长度小于字符串长度时，返回原字符串
#   zfill(),右对齐，用0填充，，只接受一个参数，用于指定字符串长度

str = 'hello python !'
print(str.center(20,'*'))
print(str.ljust(20,'*'))
print(str.rjust(20,'*'))
print(str.zfill(20))

#   sprit，从左边开始分割，参数 maxsplit 为最大分割次数
#   rsprit，从右边开始分割，参数 maxsplit 为最大分割次数
lst = str.split()
print(lst)
print(str.split(maxsplit=1))
print(str.rsplit(maxsplit=1))

#   replace(),字符串替换，第一个参数为目标字符，第二个参数为替换的字符，第三个参数为替换的个数，不写时替换所有
str = 'hello python !'
str1 = 'aaaaaaaaaaaaaa'
print(str.replace('python','world'))
print(str1.replace('a','b',2))

#   join(),字符串连接
lst = ['a','b','c','d']
t = ('a','b','c','d')
print(''.join(lst))
print(''.join(t))
print('+'.join(lst))
print('-'.join(t))
print('*'.join("abcd"))

#   字符串切片
#   str[start:stop:step]
#   start 起始位置，不写时默认为0
#   stop  结束位置，不写时默认到最后
#   step  间隔，不写时默认为1
str = 'hello python !'
print(str[::2])
