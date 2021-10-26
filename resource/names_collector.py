import requests
import string
from pyquery import PyQuery as PQ

if __name__ == '__main__':

    txt_file = open("names.txt", "w")
    init_url = "http://www.resgain.net/english_names_"   # CAP_PAGE.html

    for cap in string.ascii_lowercase:
        print("Getting names:", cap)
        url_1 = init_url + cap + "_"
        for page in range(1, 11):
            print("\tPage", page, end=": ")
            url_2 = url_1 + str(page) + ".html"

            result = requests.get(url_2)
            if result.status_code != 200:
                continue
            # print(result.text)
            doc = PQ(result.text)
            item_body = doc("body > div.main_ > div.container > div.row > div:nth-child(3) > table > tbody")
            item_list = item_body.find("tr > td:nth-child(1)")

            all_names = item_list.text().strip().split()
            if len(all_names) == 0:
                break
            names_line = ""
            for each in all_names:
                names_line += each + " "

            # names_line = item_list.text()
            print("\t", names_line)
            txt_file.write(names_line + "\n")

    txt_file.close()
