class CreateAndDeleteCycles ():
    def main(self):
        instanceOf = CreateAndDeleteCycles()
        instanceOf.initalize(self, 10000, 100, 10000, 1, 2)

    def initalize(self, initsize, listsize, inserts, delaymilisec, rate):
        self.initsize = initsize
        self.listsize = listsize
        self.inserts = inserts
        self.delaymilisec = delaymilisec
        self.rate = rate

        myList = LinkedList2D()