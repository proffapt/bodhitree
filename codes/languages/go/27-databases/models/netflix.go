package models

import (
	"go.mongodb.org/mongo-driver/bson/primitive"
)

type Netflix struct {
	ID      primitive.ObjectID `json:"_id,omitempty" bson:"_id,omitempty"`
	Movie   string             `json:"movie,omitempty"`
	Watched bool               `json:"watched,omitempty"`
}

// BSON (`bson:"_id,omitempty"`)
/*
	BSON - Binary javaScript Object Notation
	Example:
	{"hello": "world"} in JSON → to BSON
	\x16\x00\x00\x00           // total document size
	\x02                       // 0x02 = type String
	hello\x00                  // field name
	\x06\x00\x00\x00world\x00  // field value
	\x00                       // 0x00 = type EOO

	JSON is used to send data through the network (mostly through APIs).
	BSON is used by Databases to store data.

	And this ^^ particular line clears out why BSON is needed here since we are using MongoDB
	and interacting with it through bare drivers not by an ORM we will need to access data from it
	and as we read it is stored in bson
*/

// Why primitive.ObjectID?
/*
	MongoDB generates IDs automatically. They have following benifits:
	- They are unique
	- They are searchable / query-able
	**** It is in BSON format by default.

	Hence, to reduce a lot of overhead from us like:
	- maintaining uniqueness for the id
	- looping throgh all the entries for searching for an id
*/

// Why using JSON and BSON both?
/*
	The primitive.ObjectID is BSON by default
	But it is not human readable so we also provided JSON since we are comfortable in reading it.
*/
