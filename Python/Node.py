class Node(object):

    def __init__(self):
        self.somenumber = 516
        self.nextnode = None

    @classmethod
    def initialize(cls):
        node = cls()
        return node

    @classmethod
    def initializewithargs(cls, somenumber):
        node = cls()
        node.somenumber = somenumber
        return node

    def setnextnode(self, nextnode):
        self.nextnode = nextnode

    def getnextnode(self):
        return self.nextnode

#   This is a test case for making sure the initialize and initializewithargs classmethod's
#   are working properly.
#
#node = Node.initializewithargs(115)
#node1 = Node.initialize()
#node2 = Node.initializewithargs(9001)
#node2.setnextnode(node)
#print(node1.somenumber)
#a = node2.getnextnode()
#print(node2.somenumber)
#print(a.somenumber)