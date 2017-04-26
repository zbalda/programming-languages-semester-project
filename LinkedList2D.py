from Node2D import Node2D


class LinkedList2D ():

    def __index__(self):
        self.first = None

    @classmethod
    def initialize(cls):
        ll = cls()
        return ll

    @classmethod
    def initializewithargs(cls, somenode):
        ll = cls()
        ll.first = somenode
        return ll

    def insertatbeginning(self, node):
        node.setNextNode(self.first)
        self.first = node

    def insertatend(self, argnode):
        if self.first == None:
            self.first = argnode
        else:
            tempnode = self.first
            while(tempnode.getnextnode() != None):
                tempnode = tempnode.getnextnode()
            tempnode.setnextnode(argnode)

    def removefirst(self):
        if self.first == None:
            return None
        else:
            tempnode = self.first
            self.first = self.first.getnextnode()
            return tempnode

    def removelast(self):
        if self.first == None:
            return None
        elif self.first.getnextnode() == None:
            tempnode = self.first
            self.first = None
            return tempnode
        else:
            tempnode1 = self.first
            tempnode2 = self.first.getnextnode()
            while tempnode2.getnextnode() != None:
                tempnode1 = tempnode2
                tempnode2 = tempnode2.getnextnode()
            tempnode1.setnextnode(None)
            return tempnode2

    def clear(self):
        self.first = None