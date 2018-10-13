package guru.springfrawework.sfgpetclinic.services;

import guru.springfrawework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
