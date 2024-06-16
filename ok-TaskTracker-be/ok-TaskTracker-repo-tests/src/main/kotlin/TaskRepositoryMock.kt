import models.*
import repo.*

class TaskRepositoryMock(
    private val invokeCreateTask: (DbTaskRequest) -> IDbTaskResponse = { DEFAULT_TASK_SUCCESS_EMPTY_MOCK },
    private val invokeReadTask: (DbTaskIdRequest) -> IDbTaskResponse = { DEFAULT_TASK_SUCCESS_EMPTY_MOCK },
    private val invokeUpdateTask: (DbTaskRequest) -> IDbTaskResponse = { DEFAULT_TASK_SUCCESS_EMPTY_MOCK },
    private val invokeDeleteTask: (DbTaskIdRequest) -> IDbTaskResponse = { DEFAULT_TASK_SUCCESS_EMPTY_MOCK },
    private val invokeSearchTask: (DbTaskFilterRequest) -> IDbTasksResponse = { DEFAULT_TASKS_SUCCESS_EMPTY_MOCK },
): IRepoTask {
    override suspend fun createTask(rq: DbTaskRequest): IDbTaskResponse {
        return invokeCreateTask(rq)
    }

    override suspend fun readTask(rq: DbTaskIdRequest): IDbTaskResponse {
        return invokeReadTask(rq)
    }

    override suspend fun updateTask(rq: DbTaskRequest): IDbTaskResponse {
        return invokeUpdateTask(rq)
    }

    override suspend fun deleteTask(rq: DbTaskIdRequest): IDbTaskResponse {
        return invokeDeleteTask(rq)
    }

    override suspend fun searchTask(rq: DbTaskFilterRequest): IDbTasksResponse {
        return invokeSearchTask(rq)
    }

    companion object {
        val DEFAULT_TASK_SUCCESS_EMPTY_MOCK = DbTaskResponseOk(TrackerTask())
        val DEFAULT_TASKS_SUCCESS_EMPTY_MOCK = DbTasksResponseOk(emptyList())
    }
}
