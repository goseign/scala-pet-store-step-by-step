package io.m99.petstore.domain

import io.m99.petstore.domain.pets.Pet
import io.m99.petstore.domain.users.User

sealed trait ValidationError extends Product with Serializable

case class PetAlreadyExistsError(pet: Pet) extends ValidationError
case object PetNotFoundError               extends ValidationError

case object OrderNotFoundError extends ValidationError

case object UserNotFoundError                 extends ValidationError
case class UserAlreadyExistsError(user: User) extends ValidationError
