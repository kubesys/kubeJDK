package com.uit.cloud.kubernetes;

import com.github.kubesys.kubernetes.ExtendedKubernetesClient;
import com.github.kubesys.kubernetes.api.model.virtualmachine.Lifecycle;

public class RestoreVMTest {
    public static void main(String[] args) throws Exception {

        ExtendedKubernetesClient client = AbstractTest.getClient();
        boolean successful = client.virtualMachines()
                .restoreVM("cloudinit", "vm.node22", getRestoreVM());
        System.out.println(successful);
    }

    public static Lifecycle.RestoreVM getRestoreVM() {
        Lifecycle.RestoreVM restoreVM = new Lifecycle.RestoreVM();
        restoreVM.setPool("migratepoolnodepool22");
        restoreVM.setVersion("vmbackup2");
//        restoreVM.setAll(true);
//        restoreVM.setTarget("migratepoolnodepool22");
//        restoreVM.setNewname("cloudinitbackup2");
        return restoreVM;
    }
}
