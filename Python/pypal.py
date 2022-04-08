from http.client import PAYMENT_REQUIRED


from payment import Payment

class Pypal(Payment):
    email = str

    def __init__(self, id, email):
        super().__init__(id)
        self.email = email