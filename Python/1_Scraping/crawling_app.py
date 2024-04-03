from selenium import webdriver
import time
import urllib.request

search = '고양이'
fileName = 'cat_image'
number = 30
interval = 0.2

driver_path = 'chromedriver.exe'
# options = webdriver.ChromeOptions()
# options.add_argument('headless')
driver = webdriver.Chrome(driver_path)
# driver = webdriver.Chrome(driver_path, options=options)

driver.get(f"https://www.google.com/search?q={search}&sca_esv=2677688350dc5440&sca_upv=1&udm=2&prmd=isvnmbz&sxsrf=ACQVn0-8NkVbFE_LeKswcF5INcXJa8M9HQ:1712153619578&source=lnt&tbs=sur:ol&uds=AMwkrPsKdw6NKXr7dpE0DWrb0bVb_j98q8QDy7QE4U9Df6SifjYf1UrhGyiJ2gCOyMIbzG_cAAq6B0yRyS5g6SsGWwTs1O8vN4cL31HCx761ypFUsBfI4UJNfKWZaHWpprqleTbXl2GveKud_QXQljw-jMMz1iWQcHXZXGfhtW9EAz3D9-YbrnaouMJ7xBkYU9563up8SVDYMXa6tFJq13sd8XxnUNkn7mu4WxJppYL2D5oJoTXA7fQmw3KdNdYJHF4tqoy825yA&sa=X&ved=2ahUKEwjhx66inaaFAxV6bvUHHVpDC14QpwV6BAgBECE&biw=1440&bih=765&dpr=2")

firstImage = driver.find_element_by_css_selector('#dimg_299')
firstImage.click()

for i in range(number):
    try:
        time.sleep(interval)
        image = driver.find_element_by_css_selector('#Sva75c > div.A8mJGd.NDuZHe.OGftbe-N7Eqid-H9tDt > div.LrPjRb > div.AQyBn > div.tvh9oe.BIB1wf > c-wiz > div > div > div > div > div.v6bUne > div.p7sI2.PUxBg > a > img.sFlh5c.pT0Scc.iPVvYb')
        imageSrc = image.get_attribute('src')
        urllib.request.urlretrieve(imageSrc, f'{fileName}_{i+1}.jpg')
    except:
        print(f'{i+1}번째 이미지 저장 오류 발생')
    else:
        print(f'{i+1}번째 이미지 저장 성공')
    finally:
        nextButton = driver.find_element_by_css_selector('#Sva75c > div.A8mJGd.NDuZHe.OGftbe-N7Eqid-H9tDt > div.LrPjRb > div.AQyBn > div.tvh9oe.BIB1wf > c-wiz > div > div > div > div > div.s9n5ef.VTMWGb > div > div.HJRshd > button:nth-child(2) > div > svg')
        nextButton.click()

# time.sleep(10)
driver.quit()