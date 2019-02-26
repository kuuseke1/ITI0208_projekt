<template>
    <div class="nav_container">
        <div class="topnav">
            <router-link to="/">

            </router-link>
        </div>
        <div class="navbar">
            <router-link to="/Home" :class="{ active: activeTab === 'Home'}">Home</router-link>
        </div>

    </div>
</template>

<script>
    export default {
        name: "Navigation",
        props: ['activeTab']
    }
</script>

<!-- SCOPED - limited to only this component --->
<style scoped>

</style>