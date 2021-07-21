#   creation time:2021/7/16 9:30
#   theme: string

#   index()第一次出现的位置 ,rindex()最后一次出现的位置, 没有时会抛异常
#   find()第一次出现的位置 ,rfind()最后一次出现的位置, 没有时返回 -1

s1 = 'abc'
s2 = 'ab' + 'c'
s3 = ''.join(['a','b','c'])
print(s1 is s2)
print(s1 is s3)

str = 'hello python !'
print(str.rfind('p'))

#   upper() 所有字符大写
print(str.upper())

#   lower() 所有字符小写
print(str.lower())

#   swapcase(),大写变小写，小写变大写
print(str.swapcase())

#   capitalize(),第一个字符大写，其余字符变小写
print(str.capitalize())

#   title()每个单词首字母大写，其余小写
print(str.title())
