import requests
from bs4 import BeautifulSoup

# GET request
response = requests.get("https://proffapt.github.io")
# print(response.text)

# POST request
url = "https://jsonplaceholder.typicode.com/posts"
data = { 
       "title": 'proff',
       "body": 'apt',
       "userId": 69,
       }
headers = {
        'Content-type': 'application/json; charset=UTF-8',
        }
# response = requests.post(url, headers=headers, json=data)
# print(response.text)

# Creating a soup, html parsing
soup = BeautifulSoup(response.text, 'html.parser')
# Prettfying it in the correct format
print(soup.prettify())
