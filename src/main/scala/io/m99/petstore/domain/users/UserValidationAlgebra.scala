package io.m99.petstore.domain.users

import cats.data.EitherT
import io.m99.petstore.domain.{UserAlreadyExistsError, UserNotFoundError}

trait UserValidationAlgebra[F[_]] {
  def doesNotExist(user: User): EitherT[F, UserAlreadyExistsError, Unit]
  def exists(userId: Option[Long]): EitherT[F, UserNotFoundError.type, Unit]
}
