class India():
    def capital(self):
        print("New Delhi is capital of India")

    def language(self):
        print("Hindi")

    def type(self):
        print("Developing")


class USA():
    def capital(self):
        print("Wsshington is capital of USA")

    def language(self):
        print("English")

    def type(self):
        print("Developed")


obj_IND = India()
obj_USA = USA()
for country in (obj_IND, obj_USA):
    country.capital()
    country.language()
