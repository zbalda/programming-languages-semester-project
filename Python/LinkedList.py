from Node import Node

class LinkedList:

    def __init__(self, first=None):
        self.first = first

# default constructor: list is empty
    @classmethod
    def initialize(cls):
        ll = cls()
        return ll

# overloaded constructor: list is set for an intial first node
    @classmethod
    def initializewithargs(cls, somenode):
        ll = cls()
        ll.first = somenode
        return ll

# inserts a node at the beginning of the list
    def insertatbeginning(self, argnode):
        argnode.setnextnode(self.first)
        self.first = argnode

# inserts a node at the end of the list
    def insertatend(self, argnode):
        if self.first == None:
            self.first = argnode
        else:
            tempnode = self.first
            while(tempnode.getnextnode() != None):
                tempnode = tempnode.getnextnode()
            tempnode.setnextnode((argnode))

# inserts node and creates a cycle such that the inserted node points back to first
    def insertcycle(self, argnode):
        argnode.setnextnode((self.first))
        self.insertatend(argnode)

# /* deletes the first node in the list */
    def removefirst(self):
        if self.first == None:
            return None
        else:
            tempnode = self.first
            self.first = self.first.getnextnode()
            return tempnode

#/* deletes the last node in the list */
    def removelast(self):
        if self.first == None:
            return None
        elif self.first.getnextnode() == None:
            tempnode1 = self.first
            tempnode2 = self.first.getnextnode()
            while tempnode2.getnextnode() != None:
                tempnode1 = tempnode2
                tempnode2 = tempnode2.getnextnode()
            tempnode1.setnextnode(None)
            return tempnode2

#/* clears the list by setting first to null */
    def clear(self):
        self.first = None