#   creation time:2021/7/20 10:59
#   theme: 迭代

import urllib.request
import requests

#   get请求
response = urllib.request.urlopen("http://www.baidu.com")
# print(response.read().decode('utf-8'))

#   post请求

response = requests.get(url='http://www.baidu.com')
print(response.content.decode("utf-8"))

# requests.post()

with open('a.html','w+') as f:
    f.write(f.read())
