# Kingdomino Game Design

```mermaid
classDiagram
class Board{
properties:Property[]
}

class Property {
position:Position
terrain:Terrain
}

class Tile{
terrain1:Terrain
terrain2:Terrain
}

class Terrain{
    image:Image
    numberOfCrown:int
}

```