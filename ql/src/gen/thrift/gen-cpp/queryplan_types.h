/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#ifndef queryplan_TYPES_H
#define queryplan_TYPES_H

#include <iosfwd>

#include <thrift/Thrift.h>
#include <thrift/TApplicationException.h>
#include <thrift/TBase.h>
#include <thrift/protocol/TProtocol.h>
#include <thrift/transport/TTransport.h>

#include <functional>
#include <memory>


namespace Apache { namespace Hadoop { namespace Hive {

struct AdjacencyType {
  enum type {
    CONJUNCTIVE = 0,
    DISJUNCTIVE = 1
  };
};

extern const std::map<int, const char*> _AdjacencyType_VALUES_TO_NAMES;

std::ostream& operator<<(std::ostream& out, const AdjacencyType::type& val);

std::string to_string(const AdjacencyType::type& val);

struct NodeType {
  enum type {
    OPERATOR = 0,
    STAGE = 1
  };
};

extern const std::map<int, const char*> _NodeType_VALUES_TO_NAMES;

std::ostream& operator<<(std::ostream& out, const NodeType::type& val);

std::string to_string(const NodeType::type& val);

struct OperatorType {
  enum type {
    JOIN = 0,
    MAPJOIN = 1,
    EXTRACT = 2,
    FILTER = 3,
    FORWARD = 4,
    GROUPBY = 5,
    LIMIT = 6,
    SCRIPT = 7,
    SELECT = 8,
    TABLESCAN = 9,
    FILESINK = 10,
    REDUCESINK = 11,
    UNION = 12,
    UDTF = 13,
    LATERALVIEWJOIN = 14,
    LATERALVIEWFORWARD = 15,
    HASHTABLESINK = 16,
    HASHTABLEDUMMY = 17,
    PTF = 18,
    MUX = 19,
    DEMUX = 20,
    EVENT = 21,
    ORCFILEMERGE = 22,
    RCFILEMERGE = 23,
    MERGEJOIN = 24,
    SPARKPRUNINGSINK = 25,
    TOPNKEY = 26
  };
};

extern const std::map<int, const char*> _OperatorType_VALUES_TO_NAMES;

std::ostream& operator<<(std::ostream& out, const OperatorType::type& val);

std::string to_string(const OperatorType::type& val);

struct TaskType {
  enum type {
    MAP = 0,
    REDUCE = 1,
    OTHER = 2
  };
};

extern const std::map<int, const char*> _TaskType_VALUES_TO_NAMES;

std::ostream& operator<<(std::ostream& out, const TaskType::type& val);

std::string to_string(const TaskType::type& val);

struct StageType {
  enum type {
    CONDITIONAL = 0,
    COPY = 1,
    DDL = 2,
    MAPRED = 3,
    EXPLAIN = 4,
    FETCH = 5,
    FUNC = 6,
    MAPREDLOCAL = 7,
    MOVE = 8,
    STATS = 9,
    DEPENDENCY_COLLECTION = 10,
    COLUMNSTATS = 11,
    REPL_DUMP = 12,
    REPL_BOOTSTRAP_LOAD = 13,
    REPL_STATE_LOG = 14,
    REPL_TXN = 15,
    REPL_INCREMENTAL_LOAD = 16,
    SCHEDULED_QUERY_MAINT = 17,
    ACK = 18,
    RANGER_DUMP = 19,
    RANGER_LOAD = 20,
    ATLAS_DUMP = 21,
    ATLAS_LOAD = 22
  };
};

extern const std::map<int, const char*> _StageType_VALUES_TO_NAMES;

std::ostream& operator<<(std::ostream& out, const StageType::type& val);

std::string to_string(const StageType::type& val);

class Adjacency;

class Graph;

class Operator;

class Task;

class Stage;

class Query;

class QueryPlan;

typedef struct _Adjacency__isset {
  _Adjacency__isset() : node(false), children(false), adjacencyType(false) {}
  bool node :1;
  bool children :1;
  bool adjacencyType :1;
} _Adjacency__isset;

class Adjacency : public virtual ::apache::thrift::TBase {
 public:

  Adjacency(const Adjacency&);
  Adjacency& operator=(const Adjacency&);
  Adjacency() : node(), adjacencyType((AdjacencyType::type)0) {
  }

  virtual ~Adjacency() noexcept;
  std::string node;
  std::vector<std::string>  children;
  AdjacencyType::type adjacencyType;

  _Adjacency__isset __isset;

  void __set_node(const std::string& val);

  void __set_children(const std::vector<std::string> & val);

  void __set_adjacencyType(const AdjacencyType::type val);

  bool operator == (const Adjacency & rhs) const
  {
    if (!(node == rhs.node))
      return false;
    if (!(children == rhs.children))
      return false;
    if (!(adjacencyType == rhs.adjacencyType))
      return false;
    return true;
  }
  bool operator != (const Adjacency &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const Adjacency & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

  virtual void printTo(std::ostream& out) const;
};

void swap(Adjacency &a, Adjacency &b);

std::ostream& operator<<(std::ostream& out, const Adjacency& obj);

typedef struct _Graph__isset {
  _Graph__isset() : nodeType(false), roots(false), adjacencyList(false) {}
  bool nodeType :1;
  bool roots :1;
  bool adjacencyList :1;
} _Graph__isset;

class Graph : public virtual ::apache::thrift::TBase {
 public:

  Graph(const Graph&);
  Graph& operator=(const Graph&);
  Graph() : nodeType((NodeType::type)0) {
  }

  virtual ~Graph() noexcept;
  NodeType::type nodeType;
  std::vector<std::string>  roots;
  std::vector<Adjacency>  adjacencyList;

  _Graph__isset __isset;

  void __set_nodeType(const NodeType::type val);

  void __set_roots(const std::vector<std::string> & val);

  void __set_adjacencyList(const std::vector<Adjacency> & val);

  bool operator == (const Graph & rhs) const
  {
    if (!(nodeType == rhs.nodeType))
      return false;
    if (!(roots == rhs.roots))
      return false;
    if (!(adjacencyList == rhs.adjacencyList))
      return false;
    return true;
  }
  bool operator != (const Graph &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const Graph & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

  virtual void printTo(std::ostream& out) const;
};

void swap(Graph &a, Graph &b);

std::ostream& operator<<(std::ostream& out, const Graph& obj);

typedef struct _Operator__isset {
  _Operator__isset() : operatorId(false), operatorType(false), operatorAttributes(false), operatorCounters(false), done(false), started(false) {}
  bool operatorId :1;
  bool operatorType :1;
  bool operatorAttributes :1;
  bool operatorCounters :1;
  bool done :1;
  bool started :1;
} _Operator__isset;

class Operator : public virtual ::apache::thrift::TBase {
 public:

  Operator(const Operator&);
  Operator& operator=(const Operator&);
  Operator() : operatorId(), operatorType((OperatorType::type)0), done(0), started(0) {
  }

  virtual ~Operator() noexcept;
  std::string operatorId;
  OperatorType::type operatorType;
  std::map<std::string, std::string>  operatorAttributes;
  std::map<std::string, int64_t>  operatorCounters;
  bool done;
  bool started;

  _Operator__isset __isset;

  void __set_operatorId(const std::string& val);

  void __set_operatorType(const OperatorType::type val);

  void __set_operatorAttributes(const std::map<std::string, std::string> & val);

  void __set_operatorCounters(const std::map<std::string, int64_t> & val);

  void __set_done(const bool val);

  void __set_started(const bool val);

  bool operator == (const Operator & rhs) const
  {
    if (!(operatorId == rhs.operatorId))
      return false;
    if (!(operatorType == rhs.operatorType))
      return false;
    if (!(operatorAttributes == rhs.operatorAttributes))
      return false;
    if (!(operatorCounters == rhs.operatorCounters))
      return false;
    if (!(done == rhs.done))
      return false;
    if (!(started == rhs.started))
      return false;
    return true;
  }
  bool operator != (const Operator &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const Operator & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

  virtual void printTo(std::ostream& out) const;
};

void swap(Operator &a, Operator &b);

std::ostream& operator<<(std::ostream& out, const Operator& obj);

typedef struct _Task__isset {
  _Task__isset() : taskId(false), taskType(false), taskAttributes(false), taskCounters(false), operatorGraph(false), operatorList(false), done(false), started(false) {}
  bool taskId :1;
  bool taskType :1;
  bool taskAttributes :1;
  bool taskCounters :1;
  bool operatorGraph :1;
  bool operatorList :1;
  bool done :1;
  bool started :1;
} _Task__isset;

class Task : public virtual ::apache::thrift::TBase {
 public:

  Task(const Task&);
  Task& operator=(const Task&);
  Task() : taskId(), taskType((TaskType::type)0), done(0), started(0) {
  }

  virtual ~Task() noexcept;
  std::string taskId;
  TaskType::type taskType;
  std::map<std::string, std::string>  taskAttributes;
  std::map<std::string, int64_t>  taskCounters;
  Graph operatorGraph;
  std::vector<Operator>  operatorList;
  bool done;
  bool started;

  _Task__isset __isset;

  void __set_taskId(const std::string& val);

  void __set_taskType(const TaskType::type val);

  void __set_taskAttributes(const std::map<std::string, std::string> & val);

  void __set_taskCounters(const std::map<std::string, int64_t> & val);

  void __set_operatorGraph(const Graph& val);

  void __set_operatorList(const std::vector<Operator> & val);

  void __set_done(const bool val);

  void __set_started(const bool val);

  bool operator == (const Task & rhs) const
  {
    if (!(taskId == rhs.taskId))
      return false;
    if (!(taskType == rhs.taskType))
      return false;
    if (!(taskAttributes == rhs.taskAttributes))
      return false;
    if (!(taskCounters == rhs.taskCounters))
      return false;
    if (__isset.operatorGraph != rhs.__isset.operatorGraph)
      return false;
    else if (__isset.operatorGraph && !(operatorGraph == rhs.operatorGraph))
      return false;
    if (__isset.operatorList != rhs.__isset.operatorList)
      return false;
    else if (__isset.operatorList && !(operatorList == rhs.operatorList))
      return false;
    if (!(done == rhs.done))
      return false;
    if (!(started == rhs.started))
      return false;
    return true;
  }
  bool operator != (const Task &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const Task & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

  virtual void printTo(std::ostream& out) const;
};

void swap(Task &a, Task &b);

std::ostream& operator<<(std::ostream& out, const Task& obj);

typedef struct _Stage__isset {
  _Stage__isset() : stageId(false), stageType(false), stageAttributes(false), stageCounters(false), taskList(false), done(false), started(false) {}
  bool stageId :1;
  bool stageType :1;
  bool stageAttributes :1;
  bool stageCounters :1;
  bool taskList :1;
  bool done :1;
  bool started :1;
} _Stage__isset;

class Stage : public virtual ::apache::thrift::TBase {
 public:

  Stage(const Stage&);
  Stage& operator=(const Stage&);
  Stage() : stageId(), stageType((StageType::type)0), done(0), started(0) {
  }

  virtual ~Stage() noexcept;
  std::string stageId;
  StageType::type stageType;
  std::map<std::string, std::string>  stageAttributes;
  std::map<std::string, int64_t>  stageCounters;
  std::vector<Task>  taskList;
  bool done;
  bool started;

  _Stage__isset __isset;

  void __set_stageId(const std::string& val);

  void __set_stageType(const StageType::type val);

  void __set_stageAttributes(const std::map<std::string, std::string> & val);

  void __set_stageCounters(const std::map<std::string, int64_t> & val);

  void __set_taskList(const std::vector<Task> & val);

  void __set_done(const bool val);

  void __set_started(const bool val);

  bool operator == (const Stage & rhs) const
  {
    if (!(stageId == rhs.stageId))
      return false;
    if (!(stageType == rhs.stageType))
      return false;
    if (!(stageAttributes == rhs.stageAttributes))
      return false;
    if (!(stageCounters == rhs.stageCounters))
      return false;
    if (!(taskList == rhs.taskList))
      return false;
    if (!(done == rhs.done))
      return false;
    if (!(started == rhs.started))
      return false;
    return true;
  }
  bool operator != (const Stage &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const Stage & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

  virtual void printTo(std::ostream& out) const;
};

void swap(Stage &a, Stage &b);

std::ostream& operator<<(std::ostream& out, const Stage& obj);

typedef struct _Query__isset {
  _Query__isset() : queryId(false), queryType(false), queryAttributes(false), queryCounters(false), stageGraph(false), stageList(false), done(false), started(false) {}
  bool queryId :1;
  bool queryType :1;
  bool queryAttributes :1;
  bool queryCounters :1;
  bool stageGraph :1;
  bool stageList :1;
  bool done :1;
  bool started :1;
} _Query__isset;

class Query : public virtual ::apache::thrift::TBase {
 public:

  Query(const Query&);
  Query& operator=(const Query&);
  Query() : queryId(), queryType(), done(0), started(0) {
  }

  virtual ~Query() noexcept;
  std::string queryId;
  std::string queryType;
  std::map<std::string, std::string>  queryAttributes;
  std::map<std::string, int64_t>  queryCounters;
  Graph stageGraph;
  std::vector<Stage>  stageList;
  bool done;
  bool started;

  _Query__isset __isset;

  void __set_queryId(const std::string& val);

  void __set_queryType(const std::string& val);

  void __set_queryAttributes(const std::map<std::string, std::string> & val);

  void __set_queryCounters(const std::map<std::string, int64_t> & val);

  void __set_stageGraph(const Graph& val);

  void __set_stageList(const std::vector<Stage> & val);

  void __set_done(const bool val);

  void __set_started(const bool val);

  bool operator == (const Query & rhs) const
  {
    if (!(queryId == rhs.queryId))
      return false;
    if (!(queryType == rhs.queryType))
      return false;
    if (!(queryAttributes == rhs.queryAttributes))
      return false;
    if (!(queryCounters == rhs.queryCounters))
      return false;
    if (!(stageGraph == rhs.stageGraph))
      return false;
    if (!(stageList == rhs.stageList))
      return false;
    if (!(done == rhs.done))
      return false;
    if (!(started == rhs.started))
      return false;
    return true;
  }
  bool operator != (const Query &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const Query & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

  virtual void printTo(std::ostream& out) const;
};

void swap(Query &a, Query &b);

std::ostream& operator<<(std::ostream& out, const Query& obj);

typedef struct _QueryPlan__isset {
  _QueryPlan__isset() : queries(false), done(false), started(false) {}
  bool queries :1;
  bool done :1;
  bool started :1;
} _QueryPlan__isset;

class QueryPlan : public virtual ::apache::thrift::TBase {
 public:

  QueryPlan(const QueryPlan&);
  QueryPlan& operator=(const QueryPlan&);
  QueryPlan() : done(0), started(0) {
  }

  virtual ~QueryPlan() noexcept;
  std::vector<Query>  queries;
  bool done;
  bool started;

  _QueryPlan__isset __isset;

  void __set_queries(const std::vector<Query> & val);

  void __set_done(const bool val);

  void __set_started(const bool val);

  bool operator == (const QueryPlan & rhs) const
  {
    if (!(queries == rhs.queries))
      return false;
    if (!(done == rhs.done))
      return false;
    if (!(started == rhs.started))
      return false;
    return true;
  }
  bool operator != (const QueryPlan &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const QueryPlan & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

  virtual void printTo(std::ostream& out) const;
};

void swap(QueryPlan &a, QueryPlan &b);

std::ostream& operator<<(std::ostream& out, const QueryPlan& obj);

}}} // namespace

#endif
